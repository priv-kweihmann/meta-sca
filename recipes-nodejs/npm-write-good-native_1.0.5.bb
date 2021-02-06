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

SRC_URI = "https://registry.npmjs.org/write-good/-/write-good-1.0.5.tgz"
SRC_URI[md5sum] = "0cca3e2af7865e546ec03596be50839c"
SRC_URI[sha256sum] = "efffbfb63057ad214ff07957a5423b7e9fb75f4cae45ebf013554defe0bdb3e5"

NPM_PKGNAME = "write-good"

inherit npmhelper
inherit native
