SUMMARY = "Packagegroup for inspec profiles"

inherit packagegroup
inherit sca-inspec-config

RDEPENDS_${PN} += "\
                    ${@' '.join(['inspec-%s' % x for x in d.getVar('SCA_INSPEC_MODULES').split(' ') if x])} \
                    ruby-inspec-bin \
                  "
