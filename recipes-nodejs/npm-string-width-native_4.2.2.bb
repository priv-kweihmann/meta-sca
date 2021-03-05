SUMMARY = "NPM: string-width"
DESCRIPTION = "Get the visual width of a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/string-width#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-emoji-regex-native \
           npm-is-fullwidth-code-point-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/string-width/-/string-width-4.2.2.tgz"
SRC_URI[md5sum] = "3ba2480e189a770453dc1fa4bc3753b5"
SRC_URI[sha256sum] = "d593964e756e33a11cac5e3e0c82cb65a5aefd26f2f723187cafad9f91d595e1"

NPM_PKGNAME = "string-width"

inherit npmhelper
inherit native
