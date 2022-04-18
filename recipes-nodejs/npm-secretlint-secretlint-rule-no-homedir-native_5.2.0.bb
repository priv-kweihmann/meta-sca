SUMMARY = "NPM: @secretlint/secretlint-rule-no-homedir"
DESCRIPTION = "A secretlint rule that disallow to include user's homedir path."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-homedir/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-escape-string-regexp-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-homedir/-/secretlint-rule-no-homedir-5.2.0.tgz"
SRC_URI[md5sum] = "729a982fc649bea6dfba3e2f8bd95907"
SRC_URI[sha256sum] = "2179c8d1dabc5e6742f3d66f809b0cb7b41cb533d7249adf555a480473d44c13"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-homedir"

inherit npmhelper
inherit native
