SUMMARY = "NPM: end-of-stream"
DESCRIPTION = "Call a callback when a readable/writable/duplex stream has completed or failed."
HOMEPAGE = "https://github.com/mafintosh/end-of-stream"

DEPENDS = "npm-once-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9befe7026bf915886cd566a98117c80e"

SRC_URI = "https://registry.npmjs.org/end-of-stream/-/end-of-stream-1.4.4.tgz"
SRC_URI[md5sum] = "2546ee5517c4e9c68cd7f8f6fc18cf3e"
SRC_URI[sha256sum] = "0b8becf0cba76fdddfe4ad2289917edf74047913eb6891a7922ccf822bdf0db5"

NPM_PKGNAME = "end-of-stream"

inherit npmhelper
inherit native
