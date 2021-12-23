SUMMARY = "NPM: cliui"
DESCRIPTION = "easily create complex multi-column command-line-interfaces"
HOMEPAGE = "https://github.com/yargs/cliui#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=83623193d3051ca8068a89a455c699ca"

DEPENDS = "npm-string-width-native \
           npm-strip-ansi-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/cliui/-/cliui-7.0.4.tgz"
SRC_URI[md5sum] = "c3a8fba555857874ad0dffba34a2289f"
SRC_URI[sha256sum] = "a7f4835b8683e8826a4313c1022ee78f1fd94f77806995be5e5e6daaca5403bb"

NPM_PKGNAME = "cliui"

inherit npmhelper
inherit native
