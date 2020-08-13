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

SRC_URI = "https://registry.npmjs.org/write-good/-/write-good-1.0.3.tgz"
SRC_URI[md5sum] = "9b436a2122a4a2a877a2404806293226"
SRC_URI[sha256sum] = "0c3e857846696947ae253bf776a46d4f0192636d667a8131adeae97bd9ad14e2"

NPM_PKGNAME = "write-good"

inherit npmhelper
inherit native
