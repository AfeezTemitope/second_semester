#include <check.h>
#include "add.h"  
START_TEST(test_add)
{
    ck_assert_int_eq(add(2, 2), 4);
}
END_TEST
