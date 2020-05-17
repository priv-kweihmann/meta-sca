SUMMARY = "NPM: http-cache-semantics"
DESCRIPTION = "Parses Cache-Control and other headers. Helps building correct HTTP caches and proxies"
HOMEPAGE = "https://github.com/kornelski/http-cache-semantics#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b7cd412797b9e24e3c58eff96661bf9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/http-cache-semantics/-/http-cache-semantics-4.1.0.tgz"
SRC_URI[md5sum] = "824f2cf7f7d64b22cfa58e2f4158f291"
SRC_URI[sha256sum] = "0f30f0621722f811f1def50c54c5e689827c5ca5b8367bf820ceac76577728c8"

NPM_PKGNAME = "http-cache-semantics"

inherit npmhelper
inherit native
