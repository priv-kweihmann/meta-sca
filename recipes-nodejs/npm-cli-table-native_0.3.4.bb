SUMMARY = "NPM: cli-table"
DESCRIPTION = "Pretty unicode tables for the CLI"
HOMEPAGE = "https://github.com/Automattic/cli-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4eecd6e4b36ccd3de8964c45e8f70b32"

DEPENDS = "npm-chalk-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/cli-table/-/cli-table-0.3.4.tgz"
SRC_URI[md5sum] = "317488efc4939f1b668ab4ca810eaf09"
SRC_URI[sha256sum] = "4878314ea6c5153d2165d8adfb47f715272460ca1d247023b967e76959d2bfd6"

NPM_PKGNAME = "cli-table"

inherit npmhelper
inherit native
