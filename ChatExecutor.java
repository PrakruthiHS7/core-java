 class ChatExecutor {
    public static void main(String exec[])
	{
        Chat chatPlatform = new Chat();

        // Adding chat names
        chatPlatform.addChatName("Bhel puri");
        chatPlatform.addChatName("Pani Puri");
        chatPlatform.addChatName("aloo chaat");
	    chatPlatform.addChatName("Dahi Vada");
		chatPlatform.addChatName("Masala Vade");
		chatPlatform.addChatName("Cheese Rolls");
		chatPlatform.addChatName("Phuchka");
		chatPlatform.addChatName("MasalaPuri");
        chatPlatform.addChatName("Papri Chaat");
	    chatPlatform.addChatName("Samosa Chaat");

        // Getting and printing chat names
        chatPlatform.getChatNames();
    }
}
