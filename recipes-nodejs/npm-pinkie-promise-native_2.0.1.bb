SUMMARY = "NPM: pinkie-promise"
DESCRIPTION = "ES2015 Promise ponyfill"
HOMEPAGE = "https://github.com/floatdrop/pinkie-promise"

DEPENDS = "npm-pinkie-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=be72c3ad86c1c4e9578a1945b082b17d"

SRC_URI = "https://registry.npmjs.org/pinkie-promise/-/pinkie-promise-2.0.1.tgz"
SRC_URI[md5sum] = "d6cf74027e88ca54043e91d59629a656"
SRC_URI[sha256sum] = "92b6c810617351cb03c62b39fa6241003e5da043074561448b9f08ff4f93ad14"

NPM_PKGNAME = "pinkie-promise"

inherit npmhelper
inherit native
