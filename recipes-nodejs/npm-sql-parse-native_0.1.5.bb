SUMMARY = "NPM: sql-parse"
DESCRIPTION = "SQL parsing utility"


DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10ef0afc90b1033fd8579bb21673e2ac"

SRC_URI = "https://registry.npmjs.org/sql-parse/-/sql-parse-0.1.5.tgz"
SRC_URI[md5sum] = "30b57eadc61fdb273089ccf77f6ab203"
SRC_URI[sha256sum] = "88e9949eec7c1172570d2757bc9bec095a899a5c912395a5177744e572cf41c5"

NPM_PKGNAME = "sql-parse"

inherit npmhelper
inherit native
