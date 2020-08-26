SUMMARY = "NPM: eventemitter3"
DESCRIPTION = "EventEmitter3 focuses on performance while maintaining a Node.js AND browser compatible interface."
HOMEPAGE = "https://github.com/primus/eventemitter3#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4089df5313a98fce4a7ff1738a3e4f1a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eventemitter3/-/eventemitter3-4.0.6.tgz"
SRC_URI[md5sum] = "5150a476aa0ca389cbfa3793eb83d6d8"
SRC_URI[sha256sum] = "0b2bae5947e73a677ec2922ee7ca6ef385dccc28ab8a7bcfb59d6f3e71393b47"

NPM_PKGNAME = "eventemitter3"

inherit npmhelper
inherit native
