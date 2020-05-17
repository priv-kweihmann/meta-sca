SUMMARY = "NPM: pump"
DESCRIPTION = "pipe streams together and close all of them if one of them closes"
HOMEPAGE = "https://github.com/mafintosh/pump#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9befe7026bf915886cd566a98117c80e"

DEPENDS = "npm-end-of-stream-native \
           npm-once-native"

SRC_URI = "https://registry.npmjs.org/pump/-/pump-3.0.0.tgz"
SRC_URI[md5sum] = "a877fa2487a64807474620ebd5b54464"
SRC_URI[sha256sum] = "814c1216a514032c70e204f44263088ae905d4fb0b273d35e54d0e630e4705ef"

NPM_PKGNAME = "pump"

inherit npmhelper
inherit native
