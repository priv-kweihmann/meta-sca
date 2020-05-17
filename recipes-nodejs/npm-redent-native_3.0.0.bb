SUMMARY = "NPM: redent"
DESCRIPTION = "Strip redundant indentation and indent the string"
HOMEPAGE = "https://github.com/sindresorhus/redent#readme"

DEPENDS = "npm-indent-string-native npm-strip-indent-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/redent/-/redent-3.0.0.tgz"
SRC_URI[md5sum] = "2eb0beaf643279d791be54293bae6d2b"
SRC_URI[sha256sum] = "d8d324d73d21b0847b7b22936e23685a1b27e25ca1c1566861be00134f5f2896"

NPM_PKGNAME = "redent"

inherit npmhelper
inherit native
