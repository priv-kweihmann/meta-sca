SUMMARY = "NPM: errlop"
DESCRIPTION = "An extended Error class that envelops a parent error, such that the stack trace contains the causation"
HOMEPAGE = "https://github.com/bevry/errlop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=df4a02626bf4d96ee484e99c638afb71"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/errlop/-/errlop-4.2.0.tgz"
SRC_URI[md5sum] = "43cd7ec92eebd7a95395f95dff888fd2"
SRC_URI[sha256sum] = "0f1827c200db8dfe0a5da37265427cce07d0cb1688ac7799ead67705a3923ed2"

NPM_PKGNAME = "errlop"

inherit npmhelper
inherit native
