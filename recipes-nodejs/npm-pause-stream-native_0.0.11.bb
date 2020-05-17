SUMMARY = "NPM: pause-stream"
DESCRIPTION = "a ThroughStream that strictly buffers all readable events when paused."
DEPENDS = "npm-through-native"

LICENSE = "MIT & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e84e358937c41144f40fe5dcb85d0930"

SRC_URI = "https://registry.npmjs.org/pause-stream/-/pause-stream-0.0.11.tgz"
SRC_URI[md5sum] = "ba9fb149424c2eb1e4e72226d0310d8e"
SRC_URI[sha256sum] = "66df1b1aad8eed88f70cfa06ed541252215a8b725cfcad893a58bfc93f45ebe6"

NPM_PKGNAME = "pause-stream"

inherit npmhelper
inherit native
