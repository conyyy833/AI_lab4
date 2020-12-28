**User-based collaborative filtering algorithm [UserCF]**

Idea steps:

1. Calculate the similarity between other users and the target user (using the nearest neighbor algorithm);
2. In the hospital where these neighbors often go to see a doctor, calculate the recommendation of each department according to the distance between the neighbor and you;
3. Recommend departments to you according to the degree of recommendation.