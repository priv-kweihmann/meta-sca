SUMMARY = "NPM: textlint-rule-terminology"
DESCRIPTION = "TextLint rule to check correct terms spelling"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-terminology"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=1c3c1ff2f08b4ec351c1fc7d50f3e724"

DEPENDS = "npm-lodash-native \
           npm-strip-json-comments-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-terminology/-/textlint-rule-terminology-2.1.5.tgz"
SRC_URI[md5sum] = "bcc675f5fc289aa26bed31b94945a5ed"
SRC_URI[sha256sum] = "ce30d979f551cb44ab149f531e2b7facb1f4b08e674549c2dac9972c141290c6"

NPM_PKGNAME = "textlint-rule-terminology"

inherit npmhelper
inherit native
