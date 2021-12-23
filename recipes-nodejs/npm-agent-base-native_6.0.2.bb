SUMMARY = "NPM: agent-base"
DESCRIPTION = "Turn a function into an `http.Agent` instance"
HOMEPAGE = "https://github.com/TooTallNate/node-agent-base#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=120;md5=b0b8c014cd7a5f51ad9564f75c0b4432"

DEPENDS = "npm-debug-native"

SRC_URI = "https://registry.npmjs.org/agent-base/-/agent-base-6.0.2.tgz"
SRC_URI[md5sum] = "da819cf638db0095018d6ad1c448a035"
SRC_URI[sha256sum] = "bc6da06f2a2e6bc80fa5878bd7227bd0318812976d45f47f17e1aafcec2be831"

NPM_PKGNAME = "agent-base"

inherit npmhelper
inherit native
