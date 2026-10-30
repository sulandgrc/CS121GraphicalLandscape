# CS121HelloGraphics

## Directions

### Create a repository and open a Codespace

1. While signed in to GitHub, visit the [CS121HelloGraphics repository](https://github.com/sulandgrc/CS121HelloGraphics).
2. Click **Use this template**, then select **Create a new repository**.
3. Set the owner to your account and choose a repository name, such as `CS121HelloGraphics`.
4. Click **Create repository**.
5. On your new repository's page, click **Code**.
6. Open the **Codespaces** tab and click **Create codespace on main**.
7. Wait for the Codespace to build. The first build can take a few minutes, after which VS Code will open in your browser.

### Run your graphical program

To view your graphical program, connect its output to a new browser tab through the **Ports** tab in Codespaces, then press **Run**.

1. Select the **Ports** tab in the bottom panel and click **Forward a Port**.

   > Screenshot description: The Ports tab is active in the bottom panel. No ports are forwarded yet, and a blue **Forward a Port** button is visible.

2. Click **Add Port** and enter `6080` as the port.

   > Screenshot description: A port list shows port `6080`, a forwarded address, and a running process using Python 3.

3. Hover over **Forwarded Address** and click **Open in Browser** (the globe icon). A new browser tab opens where you can view the graphical output from your Java program.

   > Screenshot description: The Ports tab shows a forwarded address link and an **Open in Browser** tooltip.

4. Select **Connect** in the new tab.

   > Screenshot description: A dark gray noVNC page displays a blue **Connect** button.

### Commit and push your changes

When you finish changing your code, commit and push your work using the Source Control icon in Codespaces or the command line:

```sh
git add .
git commit -m "Describe your change"
git push
```

### Stop your Codespace

Stop the Codespace when you're done. Visit [GitHub Codespaces](https://github.com/codespaces), click the **...** menu next to your Codespace, and select **Stop codespace**. Codespaces use a limited free monthly quota, so stop yours when you are not using it.
