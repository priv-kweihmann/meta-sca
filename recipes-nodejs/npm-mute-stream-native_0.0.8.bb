SUMMARY = "NPM: mute-stream"
DESCRIPTION = "Bytes go in, but they don't come out (when muted)."
HOMEPAGE = "https://github.com/isaacs/mute-stream#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/mute-stream/-/mute-stream-0.0.8.tgz"
SRC_URI[md5sum] = "fad7f062eed0f5091b1700ea4663c980"
SRC_URI[sha256sum] = "3e55c89913e37f0e1dcb85af13e052644663daebfceae8ae376fcd8cefe96c16"

NPM_PKGNAME = "mute-stream"

inherit npmhelper
inherit native
