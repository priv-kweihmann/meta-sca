SUMMARY = "NPM: shebang-command"
DESCRIPTION = "Get the command from a shebang"
HOMEPAGE = "https://github.com/kevva/shebang-command#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=05240cd20679544d6e90fcff746425bc"

DEPENDS = "npm-shebang-regex-native"

SRC_URI = "https://registry.npmjs.org/shebang-command/-/shebang-command-2.0.0.tgz"
SRC_URI[md5sum] = "aa7675df57afd8404d9aaa55e659f7a8"
SRC_URI[sha256sum] = "9acba5bd18a51e9cdf5898380e4df63f803e1844def64ae1a46f88cff86d556e"

NPM_PKGNAME = "shebang-command"

inherit npmhelper
inherit native
