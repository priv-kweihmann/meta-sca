SUMMARY = "RubyGem: aws-sdk-budgets"
DESCRIPTION = "Official AWS Ruby gem for AWS Budgets (AWSBudgets)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "172385610edfc5581c84a62e6d65c907"
SRC_URI[sha256sum] = "a5711e3ade90ad2cecadaacae87d1d871ebf9538166f813ec008ae410d2d2675"

GEM_NAME = "aws-sdk-budgets"

inherit rubygems
