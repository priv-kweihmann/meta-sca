SUMMARY = "Query metadatdata from sdists / bdists / installed packages"
HOMEPAGE = "https://github.com/nexB/pkginfo2"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=6fc86b61c6077306ca1f5edc8edcc490"

SRC_URI = "\
    git://github.com/nexB/pkginfo2.git;branch=master;protocol=https \
"
SRCREV = "387a73f88028236978becd4046f999fcf5174c42"

inherit setuptools3
inherit_defer native
