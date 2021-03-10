SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS_class-native += "\
                         python3-cryptography-native \
                         python3-jinja2-native \
                         python3-pyyaml-native \
                        "

RDEPENDS_${PN}_class-target += "\
                                python3-cryptography \
                                python3-jinja2 \
                                python3-modules \
                                python3-pyyaml \
                               "

SRC_URI = "http://releases.ansible.com/ansible/ansible-${PV}.tar.gz"
SRC_URI[md5sum] = "bc0e7d5e697e3b9bd25b6c5449312bef"
SRC_URI[sha256sum] = "55fee77729eab2dce854c94a7b6998f0fcb7b9a053bdaa7eb4057f01a0d5d93c"

S = "${WORKDIR}/ansible-${PV}"

UPSTREAM_CHECK_REGEX ?= "ansible-(?P<pver>(\d+\.\d+\.\d+)+)\."

inherit setuptools3

do_install_append() {
    set +e

    # install hosts and conf
    install -d ${D}/${sysconfdir}/ansible

    # There is no default inventory configuration installed for ansible,
    # so we use the example as a template to improve OOBE.
    install ${S}/examples/hosts ${D}/${sysconfdir}/ansible/
    install ${S}/examples/ansible.cfg ${D}/${sysconfdir}/ansible/

    # do not gather machine's information, which could reduce setup time
    sed -i "s|^#gathering = implicit|gathering = explicit|g" \
        ${D}/${sysconfdir}/ansible/ansible.cfg
}

CLEANBROKEN = "1"

BBCLASSEXTEND = "native"
