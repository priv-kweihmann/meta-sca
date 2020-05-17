SUMMARY = "NPM: textlint-rule-terminology"
DESCRIPTION = "TextLint rule to check correct terms spelling"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-terminology"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=1c3c1ff2f08b4ec351c1fc7d50f3e724"

DEPENDS = "npm-lodash-native \
           npm-strip-json-comments-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-terminology/-/textlint-rule-terminology-2.1.4.tgz"
SRC_URI[md5sum] = "07062d060b875a9c54129b10cd49833c"
SRC_URI[sha256sum] = "7e1e476775c77f62825df2890719137afdf09545a146b03d346cf28494d7ee0c"

NPM_PKGNAME = "textlint-rule-terminology"

inherit npmhelper
inherit native
