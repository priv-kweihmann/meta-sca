SUMMARY = "NPM: string-width"
DESCRIPTION = "Get the visual width of a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/string-width#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-eastasianwidth-native \
           npm-emoji-regex-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/string-width/-/string-width-5.1.2.tgz"
SRC_URI[md5sum] = "75e00c6784232dfacc44ebb9915c13dc"
SRC_URI[sha256sum] = "410911a1bdcb8aa0825dce92f74bf749fc08ddaa95b9be7dcbe795436014f437"

NPM_PKGNAME = "string-width"

inherit npmhelper
inherit native
