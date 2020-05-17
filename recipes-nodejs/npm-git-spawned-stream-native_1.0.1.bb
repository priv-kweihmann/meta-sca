SUMMARY = "NPM: git-spawned-stream"
DESCRIPTION = "Create a readable stream from a spawned git process."
HOMEPAGE = "https://github.com/alessioalex/git-spawned-stream"

DEPENDS = "npm-debug-native npm-spawn-to-readstream-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=50;md5=477dfa54ede28e2f361e7db05941d7a7"

SRC_URI = "https://registry.npmjs.org/git-spawned-stream/-/git-spawned-stream-1.0.1.tgz"
SRC_URI[md5sum] = "0c02d3b8d72711b24ed74e0db2140442"
SRC_URI[sha256sum] = "672f641964afc79ca6aa193a8bb8a81d4e80ed0fa98fe7f8bf853cc9fd6b6bd1"

NPM_PKGNAME = "git-spawned-stream"

inherit npmhelper
inherit native
