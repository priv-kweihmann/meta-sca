SUMMARY = "NPM: string-width"
DESCRIPTION = "Get the visual width of a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/string-width#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-emoji-regex-native \
           npm-is-fullwidth-code-point-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/string-width/-/string-width-4.2.1.tgz"
SRC_URI[md5sum] = "e74a671d1791b2da588d70c24ef0e1cf"
SRC_URI[sha256sum] = "1495d8d1509a5ea5612c3c8e2f00bf2bc28644ebaafbc19523ee9ee07c2cf444"

NPM_PKGNAME = "string-width"

inherit npmhelper
inherit native
