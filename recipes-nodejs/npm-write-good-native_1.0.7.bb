SUMMARY = "NPM: write-good"
DESCRIPTION = "Naive linter for English prose"
HOMEPAGE = "https://github.com/btford/write-good#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a09bed7470d4595fa7fe082d71715f2"

DEPENDS = "npm-adverb-where-native \
           npm-commander-native \
           npm-e-prime-native \
           npm-no-cliches-native \
           npm-passive-voice-native \
           npm-too-wordy-native \
           npm-weasel-words-native"

SRC_URI = "https://registry.npmjs.org/write-good/-/write-good-1.0.7.tgz"
SRC_URI[md5sum] = "afa93b0751042ecaa6ec0dfe9c5cf85a"
SRC_URI[sha256sum] = "4ff7a33dc9c6f821f66b91c03810e125f9d9e28b3b2b0b94dd2fabc8f789e616"

NPM_PKGNAME = "write-good"

inherit npmhelper
inherit native
