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

SRC_URI = "https://registry.npmjs.org/write-good/-/write-good-1.0.8.tgz"
SRC_URI[md5sum] = "d8e9f6ba99b1b3d2705782ca2384731b"
SRC_URI[sha256sum] = "f54db3db8db0076fd1c05411c7f3923f055176632c51dc4046ab216e51130221"

NPM_PKGNAME = "write-good"

inherit npmhelper
inherit native
