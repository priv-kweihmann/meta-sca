SUMMARY = "ScanCode is a tool to scan code for license, copyright"
HOMEPAGE = "https://github.com/nexB/scancode-toolkit"

LICENSE = "CC0-1.0 & Apache-2.0"
LIC_FILES_CHKSUM = "\
                    file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://cc0-1.0.LICENSE;md5=57f047ea87f405486a94bc5a56ba7fcf \
                    "

DEPENDS += "\
            python3-attrs-native \
            python3-beautifulsoup4-native \
            python3-bitarray-native \
            python3-boolean.py-native \
            python3-chardet-native \
            python3-click-native \
            python3-colorama-native \
            python3-commoncode-native \
            python3-contextlib2-native \
            python3-debut-native \
            python3-dparse2-native \
            python3-fingerprints-native \
            python3-ftfy-native \
            python3-future-native \
            python3-gemfileparser-native \
            python3-html5lib-native \
            python3-intbitset-native \
            python3-jaraco-functools-native \
            python3-javaproperties-native \
            python3-jinja2-native \
            python3-jsonstreams-native \
            python3-license-expression-native \
            python3-lxml-native \
            python3-markupsafe-native \
            python3-more-itertools-native \
            python3-nltk-native \
            python3-packageurl-python-native \
            python3-pdfminer-six-native \
            python3-pefile-native \
            python3-pkginfo-native \
            python3-pluggy-native \
            python3-plugincode-native \
            python3-publicsuffix2-native \
            python3-pyahocorasick-native \
            python3-pycryptodome-native \
            python3-pygments-native \
            python3-pymaven-patch-native \
            python3-python-magic-native \
            python3-pytz-native \
            python3-requests-native \
            python3-saneyaml-native \
            python3-simplejson-native \
            python3-six-native \
            python3-sortedcontainers-native \
            python3-spdx-tools-native \
            python3-tempora-native \
            python3-toml-native \
            python3-typecode-native \
            python3-typing-native \
            python3-unicodecsv-native \
            python3-urlpy-native \
            python3-xmltodict-native \
            python3-yg-lockfile-native \
            python3-zc-lockfile-native \
        "

SRC_URI = "git://github.com/nexB/scancode-toolkit.git;protocol=https;nobranch=1 \
           file://0001-remove-version-limitations.patch \
           file://scancode.sca.description"
SRCREV = "ba4bbf216c6f44572662d16c76214a08b0a69e7e"

S = "${WORKDIR}/git"

inherit sca-description
inherit native
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/scancode.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
