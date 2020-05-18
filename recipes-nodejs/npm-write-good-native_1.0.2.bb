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

SRC_URI = "https://registry.npmjs.org/write-good/-/write-good-1.0.2.tgz"
SRC_URI[md5sum] = "5973813a6311107b97d24d2075f0197f"
SRC_URI[sha256sum] = "7a69215e1fcf1f5cb376086e6e56c3e5e6113b34ccb2747157b2d84e4a53b35e"

NPM_PKGNAME = "write-good"

inherit npmhelper
inherit native
