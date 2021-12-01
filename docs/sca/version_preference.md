# potential pitfalls of version conflict

as recipes provided by meta-sca only act as a fallback, meaning they are only chosen in case no other layer in your setup provides it, for older releases it could happen that you will face version conflicts.

Typically they look like this

```text
| distutils.errors.DistutilsError: Command '['/opt/build/build/tmp/work/x86_64-linux/python3-black-native/21.10b0-r0/recipe-sysroot-native/usr/bin/python3-native/python3', '-m', 'pip', '--disable-pip-version-check', 'wheel', '--no-deps', '-w', '/tmp/tmp2mtyqib5', '--quiet', 'setuptools_scm[toml]>=6.3.1']' returned non-zero exit status 1.
```

## what can I do about?

Here you have 2 options

### use PREFERRED_VERSION

you can choose a more recent version provided by meta-sca by setting

```text
PREFERRED_VERSION_<package-name> = "<version>"
```

in your `distro.conf` or your `local.conf`

Proposed settings can be found at `https://github.com/priv-kweihmann/meta-sca/blob/<branch name>/conf/variant/scatest-qemux86-64/local.conf.sample`

### remove the module

if using a more recent version isn't an option for you, you can also remove the usage of the module that causes this issue by setting

```text
SCA_AVAILABLE_MODULES:remove = "<module name>"
```

in either your `distro.conf` or your `local.conf`
