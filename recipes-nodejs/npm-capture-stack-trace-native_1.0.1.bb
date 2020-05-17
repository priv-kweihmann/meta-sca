SUMMARY = "NPM: capture-stack-trace"
DESCRIPTION = "Error.captureStackTrace ponyfill"
HOMEPAGE = "https://github.com/floatdrop/capture-stack-trace#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=be72c3ad86c1c4e9578a1945b082b17d"

SRC_URI = "https://registry.npmjs.org/capture-stack-trace/-/capture-stack-trace-1.0.1.tgz"
SRC_URI[md5sum] = "1d2080ee256022ef84051ed7a0170e0d"
SRC_URI[sha256sum] = "daa5730dedf2b5ee67de5ea10de9ce226564f9fd50eae769bcedada99c6eab1f"

NPM_PKGNAME = "capture-stack-trace"

inherit npmhelper
inherit native
