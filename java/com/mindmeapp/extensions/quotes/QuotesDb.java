package com.mindmeapp.extensions.quotes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuotesDb {

	private static QuotesDb mInstance;
	
	public static QuotesDb getInstance() {
		if (mInstance == null) {
			mInstance = new QuotesDb();
			mInstance.init();
		}
		
		return mInstance;
	}
	
	public static List<Quote> mQuotesDb;
	
	private static List<Quote> tempList = new ArrayList<Quote>();
	private void addToList(String category, String quote, String author) {
		tempList.add(new Quote(quote, author, category));
	}
	
	/**
	 * @return A random quote from the database
	 */
	public Quote getRandomQuote() {
		int i = randInt(0, mQuotesDb.size() - 1);
		return mQuotesDb.get(i);
	}
	
	public static int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	private void init() {
		//This is just a small list of quotes scrapped at random from the web
		//TODO: Get larger amount of data and load from csv file into a database
		addToList("Uncategorized","Freedom is nothing but a chance to be better.","Albert Camus");
		addToList("Uncategorized","People hasten to judge in order not to be judged themselves","Albert Camus");
		addToList("Death","The fear of death is the most unjustified of all fears, for there's no risk of accident for someone who's dead.","Albert Einstein");
		addToList("Fear","It was the experience of mystery - even if mixed with fear - that engendered religion.","Albert Einstein");
		addToList("Gratitude","He who can no longer pause to wonder and stand rapt in awe, is as good as dead; his eYes are closed.","Albert Einstein");
		addToList("Life","Imagination is everything. It is the preview of life's coming attractions.","Albert Einstein");
		addToList("Life","Only a life lived for others is a life worthwhile.","Albert Einstein");
		addToList("Life","The devil has put a penalty on all things we enjoy in life. Either we suffer in health or we suffer in soul or we get fat.","Albert Einstein");
		addToList("Life","The monotony and solitude of a quiet life stimulates the creative mind.","Albert Einstein");
		addToList("Philosophical","You will never do anything in this world without courage. It is the greatest quality of the mind next to honor.","Aristotle");
		addToList("Philosophical","Youth is easily deceived because it is quick to hope.","Aristotle");
		addToList("Death","After your death you will be what you were before your birth.","Arthur Schopenhauer");
		addToList("Death","Every parting gives a foretaste of death, every reunion a hint of the resurrection.","Arthur Schopenhauer");
		addToList("Death","Sleep is the interest we have to pay on the capital which is called in at death; and the higher the rate of interest and the more regularly it is paid, the further the date of redemption is postponed.","Arthur Schopenhauer");
		addToList("Life","Each day is a little life: every waking and rising a little birth, every fresh morning a little youth, every going to rest and sleep a little death.","Arthur Schopenhauer");
		addToList("Life","If we were not all so interested in ourselves, life would be so uninteresting that none of us would be able to endure it.","Arthur Schopenhauer");
		addToList("Life","Satisfaction consists in freedom from pain, which is the positive element of life.","Arthur Schopenhauer");
		addToList("Life","The first forty years of life give us the text; the next thirty supply the commentary on it.","Arthur Schopenhauer");
		addToList("Life","There is no doubt that life is given us, not to be enjoyed, but to be overcome; to be got over.","Arthur Schopenhauer");
		addToList("Philosophical","Change alone is eternal, perpetual, immortal.","Arthur Schopenhauer");
		addToList("Philosophical","Compassion is the basis of morality.","Arthur Schopenhauer");
		addToList("Gratitude","I've been lucky. Opportunities don't often come along. So, when they do, you have to grab them.","Audrey Hepburn");
		addToList("Laughter","I love people who make me laugh. I honestly think it's the thing I like most, to laugh. It cures a multitude of ills. It's probably the most important thing in a person.","Audrey Hepburn");
		addToList("Life","When you have nobody you can make a cup of tea for, when nobody needs you, that's when I think life is over.","Audrey Hepburn");
		addToList("Wisdom","You can tell more about a person by what he says about others than you can by what others say about him.","Audrey Hepburn");
		addToList("Life","Human beings the world over need freedom and security that they may be able to realize their full potential.","Aung San Suu Kyi");
		addToList("Life","It is often in the name of cultural integrity as well as social stability and national security that democratic reforms based on human rights are resisted by authoritarian governments.","Aung San Suu Kyi");
		addToList("Life","Peace as a goal is an ideal which will not be contested by any government or nation, not even the most belligerent.","Aung San Suu Kyi");
		addToList("Attitude","People create their own questions because they are afraid to look straight. All you have to do is look straight and see the road, and when you see it, don't sit looking at it - walk.","Ayn Rand");
		addToList("Attitude","The question isn't who is going to let me; it's who is going to stop me.","Ayn Rand");
		addToList("Attitude","Throughout the centuries there were men who took first steps, down new roads, armed with nothing but their own vision.","Ayn Rand");
		addToList("Happiness","Happiness is that state of consciousness which proceeds from the achievement of one's values.","Ayn Rand");
		addToList("Life","Every man builds his world in his own image. He has the power to choose, but no power to escape the necessity of choice.","Ayn Rand");
		addToList("Life","The purpose of morality is to teach you, not to suffer and die, but to enjoy yourself and live.","Ayn Rand");
		addToList("Love","To say \"I love you\" one must first be able to say the \"I.\"","Ayn Rand");
		addToList("Success","To achieve, you need thought. You have to know what you are doing and that's real power.","Ayn Rand");
		addToList("Truth","Do not ever say that the desire to \"do good\" by force is a good motive. Neither power-lust nor stupidity are good motives.","Ayn Rand");
		addToList("Truth","Just as man can't exist without his body, so no rights can exist without the right to translate one's rights into reality, to think, to work and keep the results, which means: the right of property.","Ayn Rand");
		addToList("Truth","Man's unique reward, however, is that while animals survive by adjusting themselves to their background, man survives by adjusting his background to himself.","Ayn Rand");
		addToList("Wealth","Money is only a tool. It will take you wherever you wish, but it will not replace you as the driver.","Ayn Rand");
		addToList("Wealth","Only the man who does not need it, is fit to inherit wealth, the man who would make his fortune no matter where he started.","Ayn Rand");
		addToList("Wisdom","A creative man is motivated by the desire to achieve, not by the desire to beat others.","Ayn Rand");
		addToList("Wisdom","Ask yourself whether the dream of heaven and greatness should be waiting for us in our graves - or whether it should be ours here and now and on this earth.","Ayn Rand");
		addToList("Wisdom","Contradictions do not exist. Whenever you think you are facing a contradiction, check your premises. You will find that one of them is wrong.","Ayn Rand");
		addToList("Wisdom","The ladder of success is best climbed by stepping on the rungs of opportunity.","Ayn Rand");
		addToList("Wisdom","The worst guilt is to accept an unearned guilt.","Ayn Rand");
		addToList("Life","Without publicity there can be no public support, and without public support every nation must decay.","Benjamin Disraeli");
		addToList("Life","Without tact you can learn nothing.","Benjamin Disraeli");
		addToList("Life","Worry - a God, invisible but omnipotent. It steals the bloom from the cheek and lightness from the pulse; it takes away the appetite, and turns the hair gray.","Benjamin Disraeli");
		addToList("Life","You can tell the strength of a nation by the women behind its men.","Benjamin Disraeli");
		addToList("Life","You will find as you grow older that courage is the rarest of all qualities to be found in public life.","Benjamin Disraeli");
		addToList("Life","Youth is a blunder; Manhood a struggle, Old Age a regret.","Benjamin Disraeli");
		addToList("Attitude","Work as if you were to live a hundred years. Pray as if you were to die tomorrow.","Benjamin Franklin");
		addToList("Death","I look upon death to be as necessary to our constitution as sleep. We shall rise refreshed in the morning.","Benjamin Franklin");
		addToList("Death","I saw few die of hunger; of eating, a hundred thousand.","Benjamin Franklin");
		addToList("Death","In this world nothing can be said to be certain, except death and taxes.","Benjamin Franklin");
		addToList("Death","Many people die at twenty five and aren't buried until they are seventy five.","Benjamin Franklin");
		addToList("Faith","He that lives upon hope will die fasting.","Benjamin Franklin");
		addToList("Fear","Do not fear mistakes. You will know failure. Continue to reach out.","Benjamin Franklin");
		addToList("Life","A life of leisure and a life of laziness are two things. There will be sleeping enough in the grave.","Benjamin Franklin");
		addToList("Life","Dost thou love life? Then do not squander time, for that is the stuff life is made of.","Benjamin Franklin");
		addToList("Life","I should have no objection to go over the same life from its beginning to the end: requesting only the advantage authors have, of correcting in a second edition the faults of the first.","Benjamin Franklin");
		addToList("Life","Life's Tragedy is that we get old to soon and wise too late.","Benjamin Franklin");
		addToList("Life","To lengthen thy life, lessen thy meals.","Benjamin Franklin");
		addToList("Love","When men and woman die, as poets sung, his heart's the last part moves, her last, the tongue.","Benjamin Franklin");
		addToList("Religion","Rebellion against tyrants is obedience to God.","Benjamin Franklin");
		addToList("Truth","Three can keep a secret, if two of them are dead.","Benjamin Franklin");
		addToList("Uncategorized","A countryman between two lawyers is like a fish between two cats.","Benjamin Franklin");
		addToList("Uncategorized","A great empire, like a great cake, is most easily diminished at the edges.","Benjamin Franklin");
		addToList("Uncategorized","Do good to your friends to keep them, to your enemies to win them.","Benjamin Franklin");
		addToList("Wisdom","If you would not be forgotten as soon as you are dead, either write something worth reading or do things worth writing.","Benjamin Franklin");
		addToList("Uncategorized","Great lives never go out; they go on.","Benjamin Harrison");
		addToList("Uncategorized","To know oneself is to study oneself in action with another person.","Bruce Lee");
		addToList("Death","Even death is not to be feared by one who has lived wisely.","Buddha");
		addToList("Death","To be idle is a short road to death and to be diligent is a way of life; foolish people are idle, wise people are diligent.","Buddha");
		addToList("Fear","An insincere and evil friend is more to be feared than a wild beast; a wild beast may wound your body, but an evil friend will wound your mind.","Buddha");
		addToList("Fear","The whole secret of existence is to have no fear. Never fear what will become of you, depend on no one. Only the moment you reject all help are you freed.","Buddha");
		addToList("Fear","When one has the feeling of dislike for evil, when one feels tranquil, one finds pleasure in listening to good teachings; when one has these feelings and appreciates them, one is free of fear.","Buddha");
		addToList("Health","Without health life is not life; it is only a state of langour and suffering - an image of death.","Buddha");
		addToList("Life","Just as a candle cannot burn without fire, men cannot live without a spiritual life.","Buddha");
		addToList("Life","The only real failure in life is not to be true to the best one knows.","Buddha");
		addToList("Life","To live a pure unselfish life, one must count nothing as one's own in the midst of abundance.","Buddha");
		addToList("Spiritual","All wrong-doing arises because of mind. If mind is transformed can wrong-doing remain?","Buddha");
		addToList("Spiritual","What we think, we become.","Buddha");
		addToList("Spiritual","Whatever words we utter should be chosen with care for people will hear them and be influenced by them for good or ill.","Buddha");
		addToList("Spiritual","Work out your own salvation. Do not depend on others.","Buddha");
		addToList("Spiritual","You will not be punished for your anger, you will be punished by your anger.","Buddha");
		addToList("Spiritual","You, yourself, as much as anybody in the entire universe, deserve your love and affection.","Buddha");
		addToList("Attitude","There are two kinds of people: those who say to God, \"Thy will be done,\" and those to whom God says, \"All right, then, have it your way.\"","C S Lewis");
		addToList("Attitude","We all want progress, but if you're on the wrong road, progress means doing an about-turn and walking back to the right road; in that case, the man who turns back soonest is the most progressive.","C S Lewis");
		addToList("Attitude","We are what we believe we are.","C S Lewis");
		addToList("Courage","Courage is not simply one of the virtues, but the form of every virtue at the testing point.","C S Lewis");
		addToList("Failure","Experience: that most brutal of teachers. But you learn, my God do you learn.","C S Lewis");
		addToList("Friendship","Friendship is unnecessary, like philosophy, like art... It has no survival value; rather it is one of those things that give value to survival.","C S Lewis");
		addToList("Love","This is one of the miracles of love: It gives a power of seeing through its own enchantments and yet not being disenchanted.","C S Lewis");
		addToList("Perseverance","Failures are finger posts on the road to achievement.","C S Lewis");
		addToList("Religion","A man can no more diminish God's glory by refusing to worship Him than a lunatic can put out the sun by scribbling the word, 'darkness' on the walls of his cell.","C S Lewis");
		addToList("Religion","A young man who wishes to remain a sound atheist cannot be too careful of his reading.","C S Lewis");
		addToList("Religion","I believe in Christianity as I believe that the sun has risen: not only because I see it, but because by it I see everything else.","C S Lewis");
		addToList("Truth","If you look for truth, you may find comfort in the end; if you look for comfort you will not get either comfort or truth only soft soap and wishful thinking to begin, and in the end, despair.","C S Lewis");
		addToList("Wisdom","Aim at heaven and you will get earth thrown in. Aim at earth and you get neither.","C S Lewis");
		addToList("Wisdom","An explanation of cause is not a justification by reason.","C S Lewis");
		addToList("Wisdom","Miracles are a retelling in small letters of the very same story which is written across the whole world in letters too large for some of us to see.","C S Lewis");
		addToList("Wisdom","Nothing that you have not given away will ever be really yours.","C S Lewis");
		addToList("Wisdom","You are never too old to set another goal or to dream a new dream.","C S Lewis");
		addToList("Life","You know, I have found out in the course of a long public life that the things I did not say never hurt me.","Calvin Coolidge");
		addToList("Uncategorized","Any man who does not like dogs and want them about does not deserve to be in the White House.","Calvin Coolidge");
		addToList("Uncategorized","Christmas is not a time nor a season, but a state of mind. To cherish peace and goodwill, to be plenteous in mercy, is to have the real spirit of Christmas.","Calvin Coolidge");
		addToList("Uncategorized","Collecting more taxes than is absolutely necessary is legalized robbery.","Calvin Coolidge");
		addToList("Uncategorized","Don't expect to build up the weak by pulling down the strong.","Calvin Coolidge");
		addToList("Uncategorized","Economy is the method by which we prepare today to afford the improvements of tomorrow.","Calvin Coolidge");
		addToList("Uncategorized","Four-fifths of all our troubles would disappear, if we would only sit down and keep still.","Calvin Coolidge");
		addToList("Uncategorized","Heroism is not only in the man, but in the occasion.","Calvin Coolidge");
		addToList("Spiritual","Failures lies concealed in every success in every failure.","Eckhart Tolle");
		addToList("Attitude","In criticism I will be bold, and as sternly, absolutely just with friend and foe. From this purpose nothing shall turn me.","Edgar Allan Poe");
		addToList("Attitude","The ninety and nine are with dreams, content but the hope of the world made new, is the hundredth man who is grimly bent on making those dreams come true.","Edgar Allan Poe");
		addToList("Beauty","Beauty of whatever kind, in its supreme development, invariably excites the sensitive soul to tears.","Edgar Allan Poe");
		addToList("Religion","A strong argument for the religion of Christ is this - that offences against Charity are about the only ones which men on their death-beds can be made - not to understand - but to feel - as crime.","Edgar Allan Poe");
		addToList("Uncategorized","A friend is someone who knows all about you and still loves you.","Elbert Hubbard");
		addToList("Uncategorized","Do not take life too seriously. You will never get out of it alive.","Elbert Hubbard");
		addToList("Uncategorized","The greatest mistake you can make in life is to be continually fearing you will make one.","Elbert Hubbard");
		addToList("Uncategorized","Never explain. Your friends do not need it and your enemies will not believe you anyway.","Elbert Hubbard");
		addToList("Life","No one can make you feel inferior without your consent.","Eleanor Roosevelt");
		addToList("Life","A woman is like a tea bag; you never know how strong it is until it's in hot water.","Eleanor Roosevelt");
		addToList("Life","Do one thing everyday that scares you.","Eleanor Roosevelt");
		addToList("Life","Do what you feel in your heart to be right – for you’ll be criticized anyway.","Eleanor Roosevelt");
		addToList("Life","You wouldn't worry so much about what others think of you if you realized how seldom they do","Eleanor Roosevelt");
		addToList("Life","The future belongs to those who believe in the beauty of their dreams.","Eleanor Roosevelt");
		addToList("Life","Many people will walk in and out of your life, but only true friends will leave footprints in your heart","Eleanor Roosevelt");
		addToList("Life","We are afraid to care too much, for fear that the other person does not care at all","Eleanor Roosevelt");
		addToList("Life","Learn from the mistakes of others. You can’t live long enough to make them all yourself.","Eleanor Roosevelt");
		addToList("Life","You can often change your circumstances by changing your attitude","Eleanor Roosevelt");
		addToList("Life","If someone betrays you once, it’s their fault; if they betray you twice, it’s your fault.","Eleanor Roosevelt");
		addToList("Life","Beautiful young people are accidents of nature, but beautiful old people are works of art.","Eleanor Roosevelt");
		addToList("Life","Life was meant to be lived, and curiosity must be kept alive. One must never, for whatever reason, turn his back on life.","Eleanor Roosevelt");
		addToList("Life","It is not fair to ask of others what you are not willing to do yourself.","Eleanor Roosevelt");
		addToList("Life","The purpose of life is to live it, to taste experience to the utmost, to reach out eagerly and without fear for newer and richer experience.","Eleanor Roosevelt");
		addToList("Life","Life is what you make it. Always has been, always will be.","Eleanor Roosevelt");
		addToList("Philosophical","Whoever does not regard what he has as most ample wealth, is unhappy, though he be master of the world.","Epictetus");
		addToList("Philosophical","You may be always victorious if you will never enter into any contest where the issue does not wholly depend upon yourself.","Epictetus");
		addToList("Attitude","It still holds true that man is most uniquely human when he turns obstacles into opportunities.","Eric Hoffer");
		addToList("Awareness","It is the awareness of unfulfilled desires which gives a nation the feeling that it has a mission and a destiny.","Eric Hoffer");
		addToList("Awareness","The pleasure we derive from doing favors is partly in the feeling it gives us that we are not altogether worthless. It is a pleasant surprise to ourselves.","Eric Hoffer");
		addToList("Awareness","To become different from what we are, we must have some awareness of what we are.","Eric Hoffer");
		addToList("Creativity","It is the child in man that is the source of his uniqueness and creativeness, and the playground is the optimal milieu for the unfolding of his capacities and talents.","Eric Hoffer");
		addToList("Education","In times of change learners inherit the earth; while the learned find themselves beautifully equipped to deal with a world that no longer exists.","Eric Hoffer");
		addToList("Failure","It is often the failure who is the pioneer in new lands, new undertakings, and new forms of expression.","Eric Hoffer");
		addToList("Faith","Disappointment is a sort of bankruptcy - the bankruptcy of a soul that expends too much in hope and expectation.","Eric Hoffer");
		addToList("Faith","Take away hatred from some people, and you have men without faith.","Eric Hoffer");
		addToList("Faith","To know a person's religion we need not listen to his profession of faith but must find his brand of intolerance.","Eric Hoffer");
		addToList("Fear","The fear of becoming a 'has-been' keeps some people from becoming anything.","Eric Hoffer");
		addToList("Fear","You can discover what your enemy fears most by observing the means he uses to frighten you.","Eric Hoffer");
		addToList("Gratitude","The hardest arithmetic to master is that which enables us to count our blessings.","Eric Hoffer");
		addToList("Leadership","The leader has to be practical and a realist, yet must talk the language of the visionary and the idealist.","Eric Hoffer");
		addToList("Life","Man is the only creature that strives to surpass himself, and yearns for the impossible.","Eric Hoffer");
		addToList("Life","One of the marks of a truly vigorous society is the ability to dispense with passion as a midwife of action - the ability to pass directly from thought to action.","Eric Hoffer");
		addToList("Life","Passionate hatred can give meaning and purpose to an empty life.","Eric Hoffer");
		addToList("Life","The best part of the art of living is to know how to grow old gracefully.","Eric Hoffer");
		addToList("Life","The game of history is usually played by the best and the worst over the heads of the majority in the middle.","Eric Hoffer");
		addToList("Truth","It is not actual suffering but the taste of better things which excites people to revolt.","Eric Hoffer");
		addToList("Truth","It is not so much the example of others we imitate as the reflection of ourselves in their eYes and the echo of ourselves in their words.","Eric Hoffer");
		addToList("Truth","Our greatest pretenses are built up not to hide the evil and the ugly in us, but our emptiness. The hardest thing to hide is something that is not there.","Eric Hoffer");
		addToList("Truth","Our passionate preoccupation with the sky, the stars, and a God somewhere in outer space is a homing impulse. We are drawn back to where we came from.","Eric Hoffer");
		addToList("Truth","Our sense of power is more vivid when we break a man's spirit than when we win his heart.","Eric Hoffer");
		addToList("Truth","Someone who thinks the world is always cheating him is right. He is missing that wonderful feeling of trust in someone or something.","Eric Hoffer");
		addToList("Forgiveness","Forgive, son; men are men; they needs must err.","Euripides");
		addToList("Friendship","Friends show their love in times of trouble.","Euripides");
		addToList("Friendship","One does nothing who tries to console a despondent person with word. A friend is one who aids with deeds at a critical time when deeds are called for.","Euripides");
		addToList("Friendship","One loyal friend is worth ten thousand relatives.","Euripides");
		addToList("Life","Life has no blessing like a prudent friend.","Euripides");
		addToList("Wisdom","Silence is true wisdom's best reply.","Euripides");
		addToList("Youth","Youth is the best time to be rich, and the best time to be poor.","Euripides");
		addToList("Failure","Never confuse a single defeat with a final defeat.","F Scott Fitzgerald");
		addToList("Failure","Show me a hero and I'll write you a tragedy.","F Scott Fitzgerald");
		addToList("Forgiveness","Forgotten is forgiven.","F Scott Fitzgerald");
		addToList("Writing","You don't write because you want to say something, you write because you have something to say.","F Scott Fitzgerald");
		addToList("Death","Without music to decorate it, time is just a bunch of boring production deadlines or dates by which bills must be paid.","Frank Zappa");
		addToList("Life","There is more stupidity than hydrogen in the universe, and it has a longer shelf life.","Frank Zappa");
		addToList("Fear","The only thing we have to fear is fear itself.","Franklin D Roosevelt");
		addToList("Life","Art is not a treasure in the past or an importation from another land, but part of the present life of all living and creating peoples.","Franklin D Roosevelt");
		addToList("Life","We have always held to the hope, the belief, the conviction that there is a better life, a better world, beyond the horizon.","Franklin D Roosevelt");
		addToList("Death","It is foolish and wrong to mourn the men who died. Rather we should thank God that such men lived.","General George S Patton");
		addToList("Death","No bastard ever won a war by dying for his country. He won it by making the other poor dumb bastard die for his country.","General George S Patton");
		addToList("Death","Prepare for the unknown by studying how others in the past have coped with the unforeseeable and the unpredictable.","General George S Patton");
		addToList("Death","The object of war is not to die for your country but to make the other bastard die for his.","General George S Patton");
		addToList("Fear","Courage is fear holding on a minute longer.","General George S Patton");
		addToList("Fear","There is a time to take counsel of your fears, and there is a time to never listen to any fear.","General George S Patton");
		addToList("Death","I want to be thoroughly used up when I die, for the harder I work the more I live. I rejoice in life for its own sake.","George Bernard Shaw");
		addToList("Death","Life contains but two tragedies. One is not to get your heart's desire; the other is to get it.","George Bernard Shaw");
		addToList("Death","Those who do not know how to live must make a merit of dying.","George Bernard Shaw");
		addToList("Death","Use your health, even to the point of wearing it out. That is what it is for. Spend all you have before you die; do not outlive yourself.","George Bernard Shaw");
		addToList("Failure","My reputation grows with every failure.","George Bernard Shaw");
		addToList("Fear","You are going to let the fear of poverty govern you life and your reward will be that you will eat, but you will not live.","George Bernard Shaw");
		addToList("Friendship","The only service a friend can really render is to keep up your courage by holding up to you a mirror in which you can see a noble image of yourself.","George Bernard Shaw");
		addToList("Imagination","Imagination is the beginning of creation. You imagine what you desire, you will what you imagine and at last you create what you will.","George Bernard Shaw");
		addToList("Knowledge","Beware of false knowledge; it is more dangerous than ignorance.","George Bernard Shaw");
		addToList("Knowledge","What we want is to see the child in pursuit of knowledge, and not knowledge in pursuit of the child.","George Bernard Shaw");
		addToList("Learning","A little learning is a dangerous thing, but we must take that risk because a little is as much as our biggest heads can hold.","George Bernard Shaw");
		addToList("Life","A gentleman is one who puts more into the world than he takes out.","George Bernard Shaw");
		addToList("Life","A life spent making mistakes is not only more honorable, but more useful than a life spent doing nothing.","George Bernard Shaw");
		addToList("Life","Better keep yourself clean and bright; you are the window through which you must see the world.","George Bernard Shaw");
		addToList("Life","Life isn't about finding yourself. Life is about creating yourself.","George Bernard Shaw");
		addToList("Life","Miracles, in the sense of phenomena we cannot explain, surround us on every hand: life itself is the miracle of miracles.","George Bernard Shaw");
		addToList("Peace","Peace is not only better than war, but infinitely more arduous.","George Bernard Shaw");
		addToList("Perseverance","No man who is occupied in doing a very difficult thing, and doing it very well, ever loses his self-respect.","George Bernard Shaw");
		addToList("Religion","There is only one religion, though there are a hundred versions of it.","George Bernard Shaw");
		addToList("Success","Success does not consist in never making mistakes but in never making the same one a second time.","George Bernard Shaw");
		addToList("Truth","Everything happens to everybody sooner or later if there is time enough.","George Bernard Shaw");
		addToList("Truth","Just do what must be done. This may not be happiness, but it is greatness.","George Bernard Shaw");
		addToList("Truth","No question is so difficult to answer as that to which the answer is obvious.","George Bernard Shaw");
		addToList("Truth","One man that has a mind and knows it can always beat ten men who haven't and don't.","George Bernard Shaw");
		addToList("Truth","The only way to avoid being miserable is not to have enough leisure to wonder whether you are happy or not.","George Bernard Shaw");
		addToList("Truth","We have no more right to consume happiness without producing it than to consume wealth without producing it.","George Bernard Shaw");
		addToList("Truth","What a man believes may be ascertained, not from his creed, but from the assumptions on which he habitually acts.","George Bernard Shaw");
		addToList("War","You'll never have a quiet world till you knock the patriotism out of the human race.","George Bernard Shaw");
		addToList("Wealth","The man with a toothache thinks everyone happy whose teeth are sound. The poverty-stricken man makes the same mistake about the rich man.","George Bernard Shaw");
		addToList("Wealth","When a man says money can do anything, that settles it: he hasn't got any.","George Bernard Shaw");
		addToList("Wisdom","Beware of the man who does not return your blow: he neither forgives you nor allows you to forgive yourself.","George Bernard Shaw");
		addToList("Wisdom","Choose silence of all virtues, for by it you hear other men's imperfections, and conceal your own.","George Bernard Shaw");
		addToList("Wisdom","Do not do unto others as you expect they should do unto you. Their tastes may not be the same.","George Bernard Shaw");
		addToList("Wisdom","Do not try to live forever. You will not succeed.","George Bernard Shaw");
		addToList("Wisdom","Take care to get what you like or you will be forced to like what you get.","George Bernard Shaw");
		addToList("Wisdom","We are made wise not by the recollection of our past, but by the responsibility for our future.","George Bernard Shaw");
		addToList("Wisdom","We must always think about things, and we must think about things as they are, not as they are said to be.","George Bernard Shaw");
		addToList("Life","Every day confirms my opinion on the superiority of a vicious life, and if Virtue is not its own reward, I don't know any other stipend annexed to it.","George Byron");
		addToList("Life","I slept and dreamt that life was beauty; I woke and found that life was duty.","George Byron");
		addToList("Life","There is no such thing as a life of passion any more than a continuous earthquake, or an eternal fever. Besides, who would ever shave themselves in such a state?","George Byron");
		addToList("Uncategorized","A woman who gives any advantage to a man may expect a lover but will sooner or later find a tyrant.","George Byron");
		addToList("Uncategorized","All farewells should be sudden, when forever.","George Byron");
		addToList("Uncategorized","But words are things, and a small drop of ink, Falling like dew, upon a thought, produces That which makes thousands, perhaps millions, think.","George Byron");
		addToList("Uncategorized","For what were all these country patriots born? To hunt, and vote, and raise the price of corn?","George Byron");
		addToList("Uncategorized","Everybody has talent, it's just a matter of moving around until you've discovered what it is.","George Lucas");
		addToList("Uncategorized","Learning to make films is very easy. Learning what to make films about is very hard.","George Lucas");
		addToList("Uncategorized","Whatever has happened in my quest for innovation has been part of my quest for immaculate reality.","George Lucas");
		addToList("Uncategorized","When you are a beginning film maker you are desperate to survive. The most important thing in the end is survival and being able to get to your next picture.","George Lucas");
		addToList("Uncategorized","Working hard is very important. You're not going to get anywhere without working extremely hard.","George Lucas");
		addToList("Uncategorized","You simply have to put one foot in front of the other and keep going. Put blinders on and plow right ahead.","George Lucas");
		addToList("Fear","Everywhere that freedom stirs, let tyrants fear.","George W Bush");
		addToList("Fear","The course of this conflict is not known, yet its outcome is certain. Freedom and fear, justice and cruelty, have always been at war, and we know that God is not neutral between them.","George W Bush");
		addToList("Fear","The terrorists are fighting freedom with all their cunning and cruelty because freedom is their greatest fear - and they should be afraid, because freedom is on the march.","George W Bush");
		addToList("Life","States should have the right to enact laws... particularly to end the inhumane practice of ending a life that otherwise could live.","George W Bush");
		addToList("Life","This way of life is worth defending.","George W Bush");
		addToList("Life","When you turn your heart and your life over to Christ, when you accept Christ as the savior, it changes your heart.","George W Bush");
		addToList("Uncategorized","The terrorists and their supporters declared war on the United States - and war is what they got.","George W Bush");
		addToList("Uncategorized","The United States and our allies are determined: we refuse to live in the shadow of this ultimate danger.","George W Bush");
		addToList("Uncategorized","The United States of America will never be intimidated by thugs and assassins. The killers will fail, and the Iraqi people will live in freedom.","George W Bush");
		addToList("Fear","America was not built on fear. America was built on courage, on imagination and an unbeatable determination to do the job at hand.","Harry S Truman");
		addToList("Fear","We shall never be able to remove suspicion and fear as potential causes of war until communication is permitted to flow, free and open, across international boundaries.","Harry S Truman");
		addToList("Fear","When even one American - who has done nothing wrong - is forced by fear to shut his mind and close his mouth - then all Americans are in peril.","Harry S Truman");
		addToList("Life","All my life, whenever it comes time to make a decision, I make it and forget about it.","Harry S Truman");
		addToList("Life","My choice early in life was either to be a piano-player in a whorehouse or a politician. And to tell the truth, there's hardly any difference.","Harry S Truman");
		addToList("Uncategorized","A pessimist is one who makes difficulties of his opportunities and an optimist is one who makes opportunities of his difficulties.","Harry S Truman");
		addToList("Uncategorized","You can never get all the facts from just one newspaper, and unless you have all the facts, you cannot make proper judgements about what is going on.","Harry S Truman");
		addToList("Uncategorized","You know that being an American is more than a matter of where your parents came from. It is a belief that all men are created free and equal and that everyone deserves an even break.","Harry S Truman");
		addToList("Attitude","I am only one, but still I am one. I cannot do everything, but still I can do something; and because I cannot do everything, I will not refuse to do something that I can do.","Helen Keller");
		addToList("Attitude","I long to accomplish a great and noble task, but it is my chief duty to accomplish small tasks as if they were great and noble.","Helen Keller");
		addToList("Attitude","I seldom think about my limitations, and they never make me sad. Perhaps there is just a touch of yearning at times; but it is vague, like a breeze among flowers.","Helen Keller");
		addToList("Attitude","Keep your face to the sunshine and you cannot see a shadow.","Helen Keller");
	
		mQuotesDb = Collections.unmodifiableList(tempList);
	}
	
}
