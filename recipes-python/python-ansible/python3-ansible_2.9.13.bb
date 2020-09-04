SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

DEPENDS_class-native += "\
                         ${PYTHON_PN}-cryptography-native \
                         ${PYTHON_PN}-jinja2-native \
                         ${PYTHON_PN}-pyyaml-native \
                        "

RDEPENDS_${PN}_class-target += "\
                                ${PYTHON_PN}-cryptography \
                                ${PYTHON_PN}-jinja2 \
                                ${PYTHON_PN}-modules \
                                ${PYTHON_PN}-pyyaml \
                               "

SRC_URI = "http://releases.ansible.com/ansible/ansible-${PV}.tar.gz"
SRC_URI[md5sum] = "3f66cce5bdbfc49315b9f357d36d38c5"
SRC_URI[sha256sum] = "3ab21588992fbfe9de3173aefd63da1267dc12892a60f5cfdc055fe19c549644"

S = "${WORKDIR}/ansible-${PV}"

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
