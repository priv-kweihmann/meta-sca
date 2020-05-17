SUMMARY = "NPM: eventemitter3"
DESCRIPTION = "EventEmitter3 focuses on performance while maintaining a Node.js & browser compatible interface."
HOMEPAGE = "https://github.com/primus/eventemitter3#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4089df5313a98fce4a7ff1738a3e4f1a"

SRC_URI = "https://registry.npmjs.org/eventemitter3/-/eventemitter3-4.0.4.tgz"
SRC_URI[md5sum] = "b69d27b2f0ce2a52581a4445790f273e"
SRC_URI[sha256sum] = "fa31ce8b3cb0353acdff48b966860618fbbcb3c9da8c4c5f199fc84b15a03bc8"

NPM_PKGNAME = "eventemitter3"

inherit npmhelper
inherit native
