SUMMARY = "Packagegroup for ansible security roles"

inherit packagegroup

DEPENDS += "\
             ansible-dev-sec-ansible-mysql-hardening \
             ansible-dev-sec-ansible-nginx-hardening \ 
             ansible-dev-sec-ansible-os-hardening \
             ansible-dev-sec-ansible-ssh-hardening \
             ansible-konstruktoid-ansible-role-hardening \
             ansible-sansible-security-hardening \
            "
