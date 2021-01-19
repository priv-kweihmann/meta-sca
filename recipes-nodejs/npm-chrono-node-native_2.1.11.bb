SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.1.11.tgz"
SRC_URI[md5sum] = "b3f7db56043209438cbaeac68e314a4a"
SRC_URI[sha256sum] = "2b2ae1bbeb2151297d5df5d73e3d5ca70c7711af597771b50f359a0f7c7174a3"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
