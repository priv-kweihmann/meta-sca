SUMMARY = "Resolve abstract dependencies into concrete ones"
HOMEPAGE = "https://github.com/sarugaku/resolvelib"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78e1c0248051c32a38a7f820c30bd7a5"

PYPI_PACKAGE = "resolvelib"

SRC_URI[md5sum] = "6874ec7ba01a8a1398b0db7c45e15afd"
SRC_URI[sha256sum] = "bb644702b0322b9ee5557e314d96148ca56a0f37a6ddf59ba0fbe27af684f4b9"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
