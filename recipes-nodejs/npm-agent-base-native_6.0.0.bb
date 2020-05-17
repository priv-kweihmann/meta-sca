SUMMARY = "NPM: agent-base"
DESCRIPTION = "Turn a function into an `http.Agent` instance"
HOMEPAGE = "https://github.com/TooTallNate/node-agent-base#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=120;md5=b0b8c014cd7a5f51ad9564f75c0b4432"

DEPENDS = "npm-debug-native"

SRC_URI = "https://registry.npmjs.org/agent-base/-/agent-base-6.0.0.tgz"
SRC_URI[md5sum] = "8d5600408a33cac41a13c0f07330d930"
SRC_URI[sha256sum] = "d800ac65ecb471f20777fe82a0aa73669063b5577892e625816304da7039807f"

NPM_PKGNAME = "agent-base"

inherit npmhelper
inherit native
