SUMMARY = "NPM: string-width"
DESCRIPTION = "Get the visual width of a string - the number of columns required to display it"
HOMEPAGE = "https://github.com/sindresorhus/string-width#readme"

DEPENDS = "npm-emoji-regex-native npm-is-fullwidth-code-point-native npm-strip-ansi-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/string-width/-/string-width-4.2.0.tgz"
SRC_URI[md5sum] = "d7e1202535d01c2d692f15b4259d6130"
SRC_URI[sha256sum] = "b6b0c19edc66b57cea414591d74a0ea206b4baa1deebbf4b06193759f6233e3e"

NPM_PKGNAME = "string-width"

inherit npmhelper
inherit native
