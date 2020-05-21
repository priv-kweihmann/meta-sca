SUMMARY = "NPM: human-signals"
DESCRIPTION = "Human-friendly process signals"
HOMEPAGE = "https://git.io/JeluP"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=516e9dc27e78d3e350ca7869c976b0cd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/human-signals/-/human-signals-1.1.1.tgz"
SRC_URI[md5sum] = "ab2b5e94b4d0f208812cb8440b38c277"
SRC_URI[sha256sum] = "fb95db0ca44a750f41d929641104c7d4a0ea484446c2be554f764d1e3263e279"

NPM_PKGNAME = "human-signals"

inherit npmhelper
inherit native
