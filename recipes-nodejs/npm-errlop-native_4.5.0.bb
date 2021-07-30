SUMMARY = "NPM: errlop"
DESCRIPTION = "An extended Error class that envelops a parent error, such that the stack trace contains the causation"
HOMEPAGE = "https://github.com/bevry/errlop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=df4a02626bf4d96ee484e99c638afb71"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/errlop/-/errlop-4.5.0.tgz"
SRC_URI[md5sum] = "2b86812b95748c0e978580627a3e7689"
SRC_URI[sha256sum] = "fe934b7781033960a74a80b2353c49c5c6754c7eb27671664227e6d123ed20b5"

NPM_PKGNAME = "errlop"

inherit npmhelper
inherit native
