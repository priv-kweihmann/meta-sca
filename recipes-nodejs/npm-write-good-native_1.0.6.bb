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

SRC_URI = "https://registry.npmjs.org/write-good/-/write-good-1.0.6.tgz"
SRC_URI[md5sum] = "a5c985180c48bb957cace3545ba0c581"
SRC_URI[sha256sum] = "cc63cf27c95db982aabcc9cd2fa59e55382589f6e75ee17f26ebea941f715351"

NPM_PKGNAME = "write-good"

inherit npmhelper
inherit native
