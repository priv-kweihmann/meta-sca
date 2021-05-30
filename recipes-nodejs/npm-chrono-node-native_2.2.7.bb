SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.2.7.tgz"
SRC_URI[md5sum] = "fccd65fd556cfff096e420e7f5bf85d6"
SRC_URI[sha256sum] = "a586aee7e65a0732abeed59fc14f0a57057e1465d5fcb9814e3fe720ba7a0d40"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
