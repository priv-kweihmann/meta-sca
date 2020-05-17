SUMMARY = "NPM: write-good"
DESCRIPTION = "Naive linter for English prose"
HOMEPAGE = "https://github.com/btford/write-good#readme"

DEPENDS = "npm-adverb-where-native npm-e-prime-native npm-no-cliches-native npm-object.assign-native npm-passive-voice-native npm-too-wordy-native npm-weasel-words-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d95053ba2507403641cd98028512be73"

SRC_URI = "https://registry.npmjs.org/write-good/-/write-good-0.11.3.tgz"
SRC_URI[md5sum] = "39e53030e1d0b5e3ce0296f3d47ac909"
SRC_URI[sha256sum] = "d1c613e035abd2efe11033654e1fb51fab843ac309ce7f81edb948e0e161f245"

NPM_PKGNAME = "write-good"

inherit npmhelper
inherit native
