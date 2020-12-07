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

SRC_URI = "https://registry.npmjs.org/write-good/-/write-good-1.0.4.tgz"
SRC_URI[md5sum] = "649185d67209d905ce5ed259df5aae65"
SRC_URI[sha256sum] = "c9de39a23d60d99e22878b1e7a847b03888f848d04c4691f50e894aea9d54c5f"

NPM_PKGNAME = "write-good"

inherit npmhelper
inherit native
