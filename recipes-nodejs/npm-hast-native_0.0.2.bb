SUMMARY = "NPM: hast"
DESCRIPTION = "HTML processor powered by plugins"
HOMEPAGE = "https://github.com/wooorm/hast#readme"

DEPENDS = "npm-bail-native npm-camelcase-native npm-ent-native npm-escape-html-native npm-htmlparser2-native npm-param-case-native npm-property-information-native npm-trim-native npm-unified-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7e5307a85144ae88c8ce8eb803918a97"

SRC_URI = "https://registry.npmjs.org/hast/-/hast-0.0.2.tgz"
SRC_URI[md5sum] = "53a46db095818dffdbb9523edffc119f"
SRC_URI[sha256sum] = "8288f8f9289d936b2bddb52515b56e3b2fdb5fe4e41680f5bb44b325f58f95ba"

NPM_PKGNAME = "hast"

inherit npmhelper
inherit native
