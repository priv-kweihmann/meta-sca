SUMMARY = "NPM: pump"
DESCRIPTION = "pipe streams together and close all of them if one of them closes"
HOMEPAGE = "https://github.com/mafintosh/pump#readme"

DEPENDS = "npm-end-of-stream-native npm-once-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9befe7026bf915886cd566a98117c80e"

SRC_URI = "https://registry.npmjs.org/pump/-/pump-1.0.3.tgz"
SRC_URI[md5sum] = "a64608ca57d9d13613e3c0952aea3589"
SRC_URI[sha256sum] = "0ae3d4aa9b9d33b3944b045bb038816af354b7bb9e638ae9b1288c3eee0a7a89"

NPM_PKGNAME = "pump"

inherit npmhelper
inherit native
