SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "01c6d5029031863ec30b5e30ef0d8b6f"
SRC_URI[sha256sum] = "23e716492dc414f1d0869f078fa597953b75d44d52d7d4087a908e389ce62e09"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
