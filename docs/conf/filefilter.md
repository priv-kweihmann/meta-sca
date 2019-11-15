# Tool specific file filter

You can skip testing certain files.
You can set this globally by appending to **SCA_FILE_FILTER** or on a recipe level by defining a variable called **SCA_FILE_FILTER_EXTRA**.

## Example

If you want to ignore all files under the folder __vendor__ insert

```bitbake
SCA_FILE_FILTER += "**/vendor/* */vendor/*"
```
